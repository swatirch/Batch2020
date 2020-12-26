import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { NgxPopper } from 'angular-popper';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { FnvComponent } from './fnv/fnv.component';
import { AboutComponent } from './home/about/about.component';
import {  enableProdMode } from '@angular/core';
import { FruitsComponent } from './fruits/fruits.component';
import { VegComponent } from './veg/veg.component'; 

 enableProdMode();
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    SignupComponent,
    FnvComponent,
    AboutComponent,
    FruitsComponent,
    VegComponent,
    
    ],

  imports: [
    BrowserModule,
    AppRoutingModule,
    NgxPopper,
    ReactiveFormsModule,
  HttpClientModule, 
],



  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
