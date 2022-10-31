/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pr.ws.b.datamahasiswa;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author alamnurcahaya
 */
@Controller
public class DataMahasiswaController {
    @RequestMapping("/")
    public String register(){
        return "index";
    }
    @PostMapping("/view")
    public String view(
            @RequestParam("name") String name,
            @RequestParam("studentid") String studentid,
            @RequestParam("dateofbirth") String dateofbirth,
            @RequestParam("gender") String gender,
            @RequestParam("photo") MultipartFile photo, ModelMap model){
        
        DataMahasiswa dm = new DataMahasiswa();
        dm.setName(name);
        dm.setStudentID(studentid);
        dm.setDateofBirth(dateofbirth);
        dm.setGender(gender);
        
        if (photo.isEmpty()){
            return "index";
        }
        
        Path path = Paths.get("src/main/resources/uploads/");
        try {
            InputStream inputStream = photo.getInputStream();
            Files.copy(inputStream, path.resolve(photo.getOriginalFilename()),
                    StandardCopyOption.REPLACE_EXISTING);
            dm.setPhoto (photo.getOriginalFilename().toLowerCase());
            
            model.addAttribute("data", dm);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return "view";
    }
}