import { Component, inject, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { LoginPageComponent } from './login-page/login-page.component';

@Component({
  selector: 'app-home',
  imports: [],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css',
})
export class HomeComponent implements OnInit {
  readonly dialog = inject(MatDialog);

  ngOnInit(): void {
    this.dialog.open(LoginPageComponent);
  }
}
