package com.example.demo;



import org.apache.tools.ant.taskdefs.Copy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {


    @RequestMapping("/")
    public String index()
    {
//        copy bk= new copy();
//        bk.setDescription("foo");
//        String desc=bk.getDescription();

        return "start";
    }
//    @GetMapping("/copy")
//    public ResponseEntity fetchAllCopy(){
//        return new ResponseEntity(HttpStatus.OK);
//
//    }
//    @GetMapping("/copy/{id}/")
//    public ResponseEntity fetchCopyById(@PathVariable("id") String id){
//        return new ResponseEntity(HttpStatus.OK);
//
//    }
//    @PostMapping(value="/copy" ,consumes="application/jason",produces="application/json")
//    public Copy createCopy(@RequestBody Copy copy){
//
//        return copy;
//    }
//    @DeleteMapping("/copy/{id}")
//    public ResponseEntity deleteCopy(@PathVariable("id") String id){
//        return new ResponseEntity(HttpStatus.OK);
//    }
}