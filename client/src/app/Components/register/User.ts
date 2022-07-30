

export class User{
    name:string="";
    email:string="";
    dob:Date=new Date();
    contactNo:string="";
    address:string="";
    password:string="";
    

    

    constructor(name:string,email:string,dob:Date,contactNo:string,address:string,password:string)
    {
        this.name=name;
        this.email=email;
        this.dob=dob;
        this.contactNo=contactNo;
        this.address=address;
        this.password=password;
    }
}