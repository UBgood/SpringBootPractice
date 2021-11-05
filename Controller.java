package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller //annotation
public class Controller
{
    @RequestMapping(value="") //route to the method
    @ResponseBody //return plaintext
    public String returnString() // return string to index page
    {
        return "Hello World";
    }
}
