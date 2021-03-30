package club.canghao.card.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@ResponseBody
@Controller
@RequestMapping("/upload")
public class uploadController {

	@ResponseBody
    @RequestMapping("/images")
    public Map<String ,Object> upload(HttpServletRequest request, @RequestParam(value = "file", required = false) MultipartFile file) throws IOException {
        request.setCharacterEncoding("UTF-8");
        System.out.println(request.toString());
        Map<String, Object> map=new HashMap<String ,Object>();
        if(!file.isEmpty()) {
            String fileName = file.getOriginalFilename();
            String path = null;
            String type = null;
            type = fileName.indexOf(".") != -1 ? fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length()) : null;
            if (type != null) {
                if ("GIF".equals(type.toUpperCase())||"PNG".equals(type.toUpperCase())||"JPG".equals(type.toUpperCase())) {
                    // ��Ŀ��������ʵ�ʷ������еĸ�·��
                    String realPath = request.getSession().getServletContext().getRealPath("/");
                    System.out.println(realPath);
                    // ���ô��ͼƬ�ļ���·��
                    path = realPath + "WEB-INF/upload/images/" + fileName;
                    file.transferTo(new File(path));
                }else {
                	map.put("result","fail");
                	map.put("msg","ֻ֧��PNG��JPG��GIF���ָ�ʽ��ͼƬ");
                    return map;
                }
            }else {
            	map.put("result","fail");
            	map.put("msg","�޷�ʶ���ϴ�ͼƬ�ĸ�ʽ");
                return map;
            }
        }else {
        	map.put("result","fail");
        	map.put("msg","ͼƬ������");
            return map;
        }
        map.put("result","success");
        map.put("fileName",file.getOriginalFilename());
        return map;
    }
}
