package com.example.immigrant.Controller.migration;

import com.example.immigrant.Repository.migration.emigrantion.*;
import com.example.immigrant.domain.migration.emigration.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/immigration")
public class emigrationController {
    @Autowired
    private emigrantion15Repository emigration15Repository;
    @Autowired
    private emigrantion00Repository emigration00Repository;
    @Autowired
    private emigrantion05Repository emigration05Repository;
    @Autowired
    private emigrantion10Repository emigration10Repository;
    @Autowired
    private emigrantion19Repository emigration19Repository;
    @Autowired
    private emigrantion95Repository emigration95Repository;
    @Autowired
    private emigrantion90Repository emigration90Repository;
    //输出各年份表所有结果
    @GetMapping(value = "/2015")
    public List<emigration15> emigration15List(){
        return emigration15Repository.findAll();
    }
    @GetMapping(value = "/2010")
    public List<emigration10> emigration10List(){
        return emigration10Repository.findAll();
    }
    @GetMapping(value = "/2000")
    public List<emigration00> emigration00List(){
        return emigration00Repository.findAll();
    }
    @GetMapping(value = "/2005")
    public List<emigration05> emigration05List(){
        return emigration05Repository.findAll();
    }
    @GetMapping(value = "/2019")
    public List<emigration19> emigration19List(){
        return emigration19Repository.findAll();
    }
    @GetMapping(value = "/1995")
    public List<emigration95> emigration95List(){
        return emigration95Repository.findAll();
    }
    @GetMapping(value = "/1990")
    public List<emigration90> emigration90List(){
        return emigration90Repository.findAll();
    }
    //输出各年份表所有结果并按Count升序返回
    @GetMapping(value = "/2000/Asc")
    public List<emigration00> emigration00ListOrderByCountAsc(){
        return emigration00Repository.OrderByCountAsc();
    }
    @GetMapping(value = "/1990/Asc")
    public List<emigration90> emigration90ListOrderByCountAsc(){
        return emigration90Repository.OrderByCountAsc();
    }
    @GetMapping(value = "/1995/Asc")
    public List<emigration95> emigration95ListOrderByCountAsc(){
        return emigration95Repository.OrderByCountAsc();
    }
    @GetMapping(value = "/2005/Asc")
    public List<emigration05> emigration05ListOrderByCountAsc(){
        return emigration05Repository.OrderByCountAsc();
    }
    @GetMapping(value = "/2015/Asc")
    public List<emigration15> emigration15ListOrderByCountAsc(){
        return emigration15Repository.OrderByCountAsc();
    }
    @GetMapping(value = "/2010/Asc")
    public List<emigration10> emigration10ListOrderByCountAsc(){
        return emigration10Repository.OrderByCountAsc();
    }
    @GetMapping(value = "/2019/Asc")
    public List<emigration19> emigration19ListOrderByCountAsc(){
        return emigration19Repository.OrderByCountAsc();
    }

    //输出各年份表所有结果并按Count降序返回
    @GetMapping(value = "/2000/Desc")
    public List<emigration00> emigration00ListOrderByCountDesc(){
        return emigration00Repository.OrderByCountDesc();
    }
    @GetMapping(value = "/1990/Desc")
    public List<emigration90> emigration90ListOrderByCountDesc(){
        return emigration90Repository.OrderByCountDesc();
    }
    @GetMapping(value = "/1995/Desc")
    public List<emigration95> emigration95ListOrderByCountDesc(){
        return emigration95Repository.OrderByCountDesc();
    }
    @GetMapping(value = "/2005/Desc")
    public List<emigration05> emigration05ListOrderByCountDesc(){
        return emigration05Repository.OrderByCountDesc();
    }
    @GetMapping(value = "/2010/Desc")
    public List<emigration10> emigration10ListOrderByCountDesc(){
        return emigration10Repository.OrderByCountDesc();
    }
    @GetMapping(value = "/2015/Desc")
    public List<emigration15> emigration15ListOrderByCountDesc(){
        return emigration15Repository.OrderByCountDesc();
    }
    @GetMapping(value = "/2019/Desc")
    public List<emigration19> emigration19ListOrderByCountDesc(){
        return emigration19Repository.OrderByCountDesc();
    }


    //根据各个年份表目的国家返回结果
    @GetMapping(value = "/2015/{destination}")
    public List<emigration15> emigration15ListByDestination(@PathVariable("destination") String Destination){
        return emigration15Repository.findByTo(Destination);
    }
    @GetMapping(value = "/2010/{destination}")
    public List<emigration10> emigration10ListByDestination(@PathVariable("destination") String Destination){
        return emigration10Repository.findByTo(Destination);
    }
    @GetMapping(value = "/2005/{destination}")
    public List<emigration05> emigration05ListByDestination(@PathVariable("destination") String Destination){
        return emigration05Repository.findByTo(Destination);
    }
    @GetMapping(value = "/2000/{destination}")
    public List<emigration00> emigration00ListByDestination(@PathVariable("destination") String Destination){
        return emigration00Repository.findByTo(Destination);
    }
    @GetMapping(value = "/2019/{destination}")
    public List<emigration19> emigration19ListByDestination(@PathVariable("destination") String Destination){
        return emigration19Repository.findByTo(Destination);
    }
    @GetMapping(value = "/1990/{destination}")
    public List<emigration90> emigration90ListByDestination(@PathVariable("destination") String Destination){
        return emigration90Repository.findByTo(Destination);
    }
    @GetMapping(value = "/1995/{destination}")
    public List<emigration95> emigration95ListByDestination(@PathVariable("destination") String Destination){
        return emigration95Repository.findByTo(Destination);
    }
    //根据各个年份表目的国家并通过Count降序返回结果返回结果
    @GetMapping(value = "/2000/{destination}/Desc")
    public List<emigration00> emigration00ListByDestinationOrderByCountDesc(@PathVariable("destination") String Destination){
        return emigration00Repository.findByToOrderByCountDesc(Destination);
    }
    @GetMapping(value = "/2005/{destination}/Desc")
    public List<emigration05> emigration05ListByDestinationOrderByCountDesc(@PathVariable("destination") String Destination){
        return emigration05Repository.findByToOrderByCountDesc(Destination);
    }
    @GetMapping(value = "/2010/{destination}/Desc")
    public List<emigration10> emigration10ListByDestinationOrderByCountDesc(@PathVariable("destination") String Destination){
        return emigration10Repository.findByToOrderByCountDesc(Destination);
    }
    @GetMapping(value = "/2015/{destination}/Desc")
    public List<emigration15> emigration15ListByDestinationOrderByCountDesc(@PathVariable("destination") String Destination){
        return emigration15Repository.findByToOrderByCountDesc(Destination);
    }
    @GetMapping(value = "/2019/{destination}/Desc")
    public List<emigration19> emigration19ListByDestinationOrderByCountDesc(@PathVariable("destination") String Destination){
        return emigration19Repository.findByToOrderByCountDesc(Destination);
    }
    @GetMapping(value = "/1995/{destination}/Desc")
    public List<emigration95> emigration95ListByDestinationOrderByCountDesc(@PathVariable("destination") String Destination){
        return emigration95Repository.findByToOrderByCountDesc(Destination);
    }
    @GetMapping(value = "/1990/{destination}/Desc")
    public List<emigration90> emigration90ListByDestinationOrderByCountDesc(@PathVariable("destination") String Destination){
        return emigration90Repository.findByToOrderByCountDesc(Destination);
    }
    //根据各个年份表目的国家并通过Count升序返回结果返回结果
    @GetMapping(value = "/2000/{destination}/Asc")
    public List<emigration00> emigration00ListByDestinationOrderByCountAsc(@PathVariable("destination") String Destination){
        return emigration00Repository.findByToOrderByCountAsc(Destination);
    }
    @GetMapping(value = "/2005/{destination}/Asc")
    public List<emigration05> emigration05ListByDestinationOrderByCountAsc(@PathVariable("destination") String Destination){
        return emigration05Repository.findByToOrderByCountAsc(Destination);
    }
    @GetMapping(value = "/2010/{destination}/Asc")
    public List<emigration10> emigration10ListByDestinationOrderByCountAsc(@PathVariable("destination") String Destination){
        return emigration10Repository.findByToOrderByCountAsc(Destination);
    }
    @GetMapping(value = "/2015/{destination}/Asc")
    public List<emigration15> emigration15ListByDestinationOrderByCountAsc(@PathVariable("destination") String Destination){
        return emigration15Repository.findByToOrderByCountAsc(Destination);
    }
    @GetMapping(value = "/2019/{destination}/Asc")
    public List<emigration19> emigration19ListByDestinationOrderByCountAsc(@PathVariable("destination") String Destination){
        return emigration19Repository.findByToOrderByCountAsc(Destination);
    }
    @GetMapping(value = "/1995/{destination}/Asc")
    public List<emigration95> emigration95ListByDestinationOrderByCountAsc(@PathVariable("destination") String Destination){
        return emigration95Repository.findByToOrderByCountAsc(Destination);
    }
    @GetMapping(value = "/1990/{destination}/Asc")
    public List<emigration90> emigration90ListByDestinationOrderByCountAsc(@PathVariable("destination") String Destination){
        return emigration90Repository.findByToOrderByCountAsc(Destination);
    }
}
