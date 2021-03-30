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
                    // 项目在容器中实际发布运行的根路径
                    String realPath = request.getSession().getServletContext().getRealPath("/");
                    System.out.println(realPath);
                    // 设置存放图片文件的路径
                    path = realPath + "WEB-INF/upload/images/" + fileName;
                    file.transferTo(new File(path));
                }else {
                	map.put("result","fail");
                	map.put("msg","只支持PNG、JPG、GIF三种格式的图片");
                    return map;
                }
            }else {
            	map.put("result","fail");
            	map.put("msg","无法识别上传图片的格式");
                return map;
            }
        }else {
        	map.put("result","fail");
        	map.put("msg","图片不存在");
            return map;
        }
        map.put("result","success");
        map.put("fileName",file.getOriginalFilename());
        return map;
    }
}
