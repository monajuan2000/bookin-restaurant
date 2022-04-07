import { Routes, RouterModule } from '@angular/router';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BookingComponent } from './components/booking/booking.component';
import { ExploreComponent } from './components/explore/explore.component';
import { CancelBookingComponent } from './components/cancel-booking/cancel-booking.component';
import { HeaderComponent } from './components/header/header.component';

const appRoutes: Routes = [
   {path: '', component: ExploreComponent},
   {path: 'booking', component: BookingComponent},
   {path: 'cancel', component: CancelBookingComponent},
   {path: '', component: ExploreComponent},
]

@NgModule({
  declarations: [
    AppComponent,
    BookingComponent,
    ExploreComponent,
    CancelBookingComponent,
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(
      appRoutes
    )
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
