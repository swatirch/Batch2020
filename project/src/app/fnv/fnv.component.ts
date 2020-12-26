import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-fnv',
  templateUrl: './fnv.component.html',
  styleUrls: ['./fnv.component.css']
})
export class FnvComponent implements OnInit {
  imgpath:string="./../assets/eat.png";
  imgName:string="Logo";
  constructor() { }

  ngOnInit(): void {
  }

}
