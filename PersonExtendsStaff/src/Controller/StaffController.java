package Controller;

import Entity.Staff;

import java.util.List;
import java.util.Optional;

public class StaffController {
    private static List<Staff> staffs;

    public StaffController(List<Staff> staffs) {
        StaffController.staffs = staffs;
    }

//Cau1:
   public Optional<Staff> getMaxPayFemales() {
       return staffs.stream()
               .filter(staff -> staff.getGender() == Gender.F)
               .max(Comparator.comparing(Staff::getPay));
  } 


    //Cau2:
    public static Optional<Staff> getById(String keyword) {
        return staffs.stream()
                .filter(staff -> staff.getId().contains(keyword))
                .findFirst();
    }
    public static List<Staff> getByName(String keyword) {
        return staffs.stream()
                .filter(staff -> staff.getName().toLowerCase().contains(keyword.toLowerCase()))
                .toList();
    }

    //    Cau3:
   public static void ChangeName(String id , String newName ){
       staff.stream()
           .filter(staff -> staff.getId().equals(id))
           .foreach(staff -> staff.setName(newName));

    


}

