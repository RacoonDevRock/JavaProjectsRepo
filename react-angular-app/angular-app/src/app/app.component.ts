import {Component} from '@angular/core';
import {CommonModule} from '@angular/common';
import {RouterOutlet} from '@angular/router';
import { ProductComponent } from './products/components/product.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'My Product App';
  enabled = false;

  courses: string[] = ['Angular', 'React', 'Spring Boot'];

  setEnabled() {
    this.enabled = !this.enabled;
    console.log('hemos hecho click en setEnabled')
  }
}
