import { Component, OnInit } from '@angular/core';
import {FormGroup, FormControl} from '@angular/forms';
import { DataService } from '../data.service';
import { ActivatedRoute, Router } from '@angular/router';
import {user} from '../user';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  form : FormGroup;
  user:any=[];
  
  constructor(private dataservice:DataService,private activatedroute:ActivatedRoute,private router:Router) { }
  
register()
{
  console.log(this.form.value)
      this.dataservice.saveData(this.form.value).subscribe((res)=>{
          console.log("data added",res);
          this.router.navigateByUrl("")

      }

  )

}


  ngOnInit(): void {

    this.form = new FormGroup(
      {
         name:new FormControl(""), 
         email:new FormControl(""), 
         pwd:new FormControl(""),
         pwd2: new FormControl("")
        
        } )
  }

}
