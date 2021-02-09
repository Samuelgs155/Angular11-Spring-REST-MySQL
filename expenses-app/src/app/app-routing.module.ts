import { ListExpensesComponent } from './components/list-expenses/list-expenses.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddExpenseComponent } from './components/add-expense/add-expense.component';

const routes: Routes = [
  {path: 'expenses', component: ListExpensesComponent},
  {path: 'addexpense', component: AddExpenseComponent},
  {path: 'editexpense/:id', component: AddExpenseComponent},
  {path: '**', pathMatch: 'full', redirectTo: 'expenses'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
