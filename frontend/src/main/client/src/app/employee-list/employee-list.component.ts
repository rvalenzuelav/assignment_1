import {Component, OnInit} from '@angular/core';
import {EmployeeService} from '../shared/employee/employee.service';
import { PageChangeEvent, GridDataResult } from '@progress/kendo-angular-grid';
import {SortDescriptor, orderBy} from '@progress/kendo-data-query';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  public multiple = true;
  public allowUnsort = true;
  public sort: SortDescriptor[] = [{
    field: 'name',
    dir: 'asc'
  }];
  public gridView: GridDataResult;
  employees: Array<any>;

  public data: any[] = this.employees;
  public pageSize = 10;
  public skip = 0;

  public sliderChange(pageIndex: number): void {
    this.skip = (pageIndex - 1) * this.pageSize;
  }

  public onPageChange(state: any): void {
    this.pageSize = state.take;
  }

  constructor(private employeeService: EmployeeService) {
  }

  ngOnInit() {
    this.employeeService.getAll().subscribe(data => {
      this.employees = data;
    });

  }

  public sortChange(sort: SortDescriptor[]): void {
    this.sort = sort;
    this.loadEmployees();
  }

  private loadEmployees(): void {
    this.gridView = {
      data: orderBy(this.employees, this.sort),
      total: this.employees.length
    };
  }

}
