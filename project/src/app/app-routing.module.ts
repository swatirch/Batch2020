import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import {SignupComponent} from './signup/signup.component';
import { FnvComponent } from './fnv/fnv.component';
import { FruitsComponent } from './fruits/fruits.component'; 

import { AboutComponent } from './home/about/about.component';

import { VegComponent } from './veg/veg.component'; 


const routes: Routes = [
  {path:"",component:HomeComponent,pathMatch:"full" },
  {path:"home",component:HomeComponent },
  {path:"login",component:LoginComponent },
  {path:"signup",component:SignupComponent },
  {path:"fnv",component:FnvComponent },
  {path:"fruits",component:FruitsComponent },
  {path:"veg",component:VegComponent },

  {path:"home/about",component:AboutComponent }
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

