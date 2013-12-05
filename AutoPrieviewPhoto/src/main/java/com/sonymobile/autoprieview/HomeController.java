package com.sonymobile.autoprieview;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory
            .getLogger(HomeController.class);

    private static final String UPLOAD_PATH = "/resources/uploads";

    /**
     * Simply selects the home view to render by returning its name.
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, HttpServletRequest request, Model model) {
        String sessionKey = request.getParameter("sessionKey");
        if (sessionKey != null || request.getSession().getAttribute("user") != null) {
            return "home";
        }
        return "redirect:/login";
    }
    
    @RequestMapping(value="logout")
    public String logout(HttpServletRequest request){
        request.getSession().invalidate();
        return "redirect:/login";
    }

    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public String doLogin(HttpServletRequest request) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        if (null != userName && password != userName) {
            request.getSession().setAttribute("user", 1);
            return "redirect:/";
        }
        return "redirect:/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/getimgs", method = RequestMethod.GET)
    @ResponseBody
    public List<Map<String, String>> getImgs(HttpServletRequest request) {
        List<Map<String, String>> list = new ArrayList<Map<String, String>>();
        String uploadPath = request.getSession().getServletContext()
                .getRealPath("/resources/uploads");
        File file = new File(uploadPath);
        File[] fs = file.listFiles();
        if (fs != null && fs.length > 0) {
            Arrays.sort(fs, new Comparator<File>() {

                @Override
                public int compare(File o1, File o2) {
                    return (int) (o1.lastModified() - o2.lastModified());
                }

            });
        }

        if (null != fs) {
            for (File f : fs) {
                Map<String, String> map = new HashMap<String, String>();
                map.put("img", f.getName());
                list.add(map);
            }
        }
        return list;
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(MultipartHttpServletRequest request)
            throws IOException {
        String realPath = request.getSession().getServletContext()
                .getRealPath(UPLOAD_PATH);
        File file = new File(realPath);
        if (!file.exists()) {
            file.mkdirs();
        }
        // 1. build an iterator
        Iterator<String> itr = request.getFileNames();
        while (itr.hasNext()) {
            // 2.1 get next MultipartFile
            saveFile(request, realPath, itr);
        }
        return "result";
    }

    private void saveFile(MultipartHttpServletRequest request, String realPath,
            Iterator<String> itr) throws IOException {
        MultipartFile mpf = null;
        mpf = request.getFile(itr.next());
        String orgName = mpf.getOriginalFilename();
        // int indexOfExtend = orgName.lastIndexOf('.');
        // String name = orgName.substring(0, indexOfExtend);
        // String extendName = orgName.substring(indexOfExtend).toLowerCase();

        String newName = realPath + File.separator + orgName;
        File newFile = new File(newName);
        // imgs.add(baseImgPath + "/" + newName + extendName);
        mpf.transferTo(newFile);
    }
}
