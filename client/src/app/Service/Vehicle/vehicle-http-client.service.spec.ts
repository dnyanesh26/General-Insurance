import { TestBed } from '@angular/core/testing';

import { VehicleHttpClientService } from './vehicle-http-client.service';

describe('VehicleHttpClientService', () => {
  let service: VehicleHttpClientService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(VehicleHttpClientService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
