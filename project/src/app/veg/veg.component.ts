import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-veg',
  templateUrl: './veg.component.html',
  styleUrls: ['./veg.component.css']
})
export class VegComponent implements OnInit {

  imgpath:string="./../assets/eat.png";
  imgName:string="Logo";
  constructor() { }

  ngOnInit(): void {
  }

}
