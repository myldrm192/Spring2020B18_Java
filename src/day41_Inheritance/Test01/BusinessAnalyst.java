package day41_Inheritance.Test01;

/*
 create subclass of employee name it businessAnalyst
     		variables: salary, name, id, jobTitle, gender
     		actions: writingRequiremnts, gathering, toString
     		creata a constructor that can initialize all the attributes of businessAnalyst
 */

public class BusinessAnalyst extends Employee {

    public BusinessAnalyst(String name,double salary, long id,char gender){
        this.name=name;
        this.salary=salary;
        this.id=id;
        jobTitle="Business Analyst";
        this.gender=gender;
    }
    public void writingReq(){
        System.out.println(name+" is writing requirements");
    }

    public void gathering(){
        System.out.println(name+" is gathering requirements");
    }

}
