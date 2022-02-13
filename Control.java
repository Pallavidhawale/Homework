package com.example.demo;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Control {



@Autowired
private DEMOREO dEMOREO;
@GetMapping("/save")

public void add(@RequestBody DEMO demo)
{
dEMOREO.save(demo);
}

@PostMapping("/get")

public List<DEMO> display()
{
return dEMOREO.findAll();
}

@GetMapping("/delete{id}")

public void delete(@PathVariable int id)
{
dEMOREO.deleteById(id);
}
@PutMapping("/update")
public DEMO update(@RequestBody DEMO demo)
{
return dEMOREO.save(demo);
}




}