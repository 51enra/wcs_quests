package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }
    
    @GetMapping("/avengers/assemble")
    public String assemble() {
        return "Avengers...Assemble";
    }
    
    @GetMapping("/secret-bases")
    public String secretBases() {
    	return  "<!DOCTYPE html>\n" + 
    			"<html>\n" + 
    			"<head>\n" + 
    			"<title>Secret Bases</title>\n" + 
    			"</head>\n" + 
    			"<body>\n" + 
    			"<h1> Our Secret Bases</h1>\n" + 
    			"<table>\n" + 
    			"<tr> \n" + 
    			"<th> France </th>\n" + 
    			"<th> Europe </th>\n" + 
    			"</tr>\n" + 
    			"<tr>\n" + 
    			"<td>Biarritz</td>\n" + 
    			"<td>Amsterdam</td>\n" + 
    			"</tr>\n" + 
    			"<tr>\n" + 
    			"<td>Bordeaux</td>\n" + 
    			"<td>Barcelona</td>\n" + 
    			"</tr>\n" + 
    			"<tr>\n" + 
    			"<td>La Loupe</td>\n" + 
    			"<td>Berlin</td>\n" + 
    			"</tr>\n" + 
    			"<tr>\n" + 
    			"<td>Lille</td>\n" + 
    			"<td>Bruxelles</td>\n" + 
    			"</tr>\n" + 
    			"<tr>\n" + 
    			"<td>Lyon</td>\n" + 
    			"<td>Bucarest</td>\n" + 
    			"</tr>\n" + 
    			"<tr>\n" + 
    			"<td>Marseille</td>\n" + 
    			"<td>Budapest</td>\n" + 
    			"</tr>\n" + 
    			"<tr>\n" + 
    			"<td>Nantes</td>\n" + 
    			"<td>Dublin</td>\n" + 
    			"</tr>\n" + 
    			"<tr>\n" + 
    			"<td>Orléans</td>\n" + 
    			"<td>Lisbonne</td>\n" + 
    			"</tr>\n" + 
    			"<tr>\n" + 
    			"<td>Paris</td>\n" + 
    			"<td>Londres</td>\n" + 
    			"</tr>\n" + 
    			"<tr>\n" + 
    			"<td>Reims</td>\n" + 
    			"<td>Madrid</td>\n" + 
    			"</tr>\n" + 
    			"<tr>\n" + 
    			"<td>Strasbourg</td>\n" + 
    			"<td>Milan</td>\n" + 
    			"</tr>\n" + 
    			"<tr>\n" + 
    			"<td>Toulouse</td>\n" + 
    			"<td></td>\n" + 
    			"</tr>\n" + 
    			"<tr>\n" + 
    			"<td>Tours</td>\n" + 
    			"<td></td>\n" + 
    			"</tr>\n" + 
    			"</table>\n" + 
    			"</body>\n" + 
    			"</html>";
    }
   
}
