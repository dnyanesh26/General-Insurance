import { TestBed } from '@angular/core/testing';

import { AdminHttpClientService } from './admin-http-client.service';

describe('AdminHttpClientService', () => {
  let service: AdminHttpClientService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AdminHttpClientService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
