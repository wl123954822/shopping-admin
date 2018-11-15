package cn.tjmj.serviceshopping.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author wanglei
 * @create 2017-12-25 10:59
 */

//上传图片工具类
public class uploadFile {

    public static Map<String, Object> uploadFile(MultipartFile file) throws IOException {
        Map<String, Object> map = new HashMap<String, Object>();
        String fileLocation = "uploadimage";
        if (file != null) {// 判断上传的文件是否为空
            String prepath = "F:\\javaSoft\\nginx\\";// 文件路径
            String patha = "";
            String path = "";
            String type = null;// 文件类型
            String fileName = file.getOriginalFilename();// 文件原名称
            // 判断文件类型
            type = fileName.indexOf(".") != -1 ? fileName.substring(fileName.lastIndexOf(".") + 1,
                    fileName.length()) : null;
            if (type != null) {// 判断文件类型是否为空
                if ("GIF".equals(type.toUpperCase()) || "PNG".equals(type.toUpperCase())
                        || "JPG".equals(type.toUpperCase())) {

                    path = fileLocation + "/itemImage/";


                    String destDirName = prepath + path;

                    File dir = new File(destDirName);
                    if (dir.exists()) {
                        // System.out.println("创建目录" + destDirName + "失败，目标目录已经存在");
                    }
                    if (!destDirName.endsWith(File.separator)) {
                        destDirName = destDirName + File.separator;
                    }
                    // 创建目录
                    if (dir.mkdirs()) {

                    }
                    // 设置存放图片文件的路径
                    patha = prepath + path + fileName;
                    file.transferTo(new File(patha));
                    map.put("status", "success");
                    map.put("path", path + fileName);

                }
            }

        }
        return map;
    }

}
