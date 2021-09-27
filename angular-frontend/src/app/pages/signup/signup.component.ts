import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { UserServiceService } from 'src/app/services/user-service.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  constructor(private userService:UserServiceService , private snack:MatSnackBar) { }
  public user={
    userName:'',
    firstName:'',
    lastName:'',
    password:'',
    email:'',
    phone:'' 

  }

  ngOnInit(): void {
  }
  formSubmit(){

    if(this.user.userName =='' || this.user.userName==null){
      this.snack.open("User Name is required","ok",{
        duration:3000,
      })
    }
    else{
    this.userService.addUser(this.user).subscribe((data)=>{
      console.log(data);
      this.snack.open("Registration successful","ok",{
        duration:3000,
        verticalPosition:'top',
        horizontalPosition:'center'
      })
        },
    (error)=>{
      console.log(error)
    }
    
    )}
    
  }

}
