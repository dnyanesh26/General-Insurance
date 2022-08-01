import { TestBed } from '@angular/core/testing';

import { PolicyHttpClientService } from './policy-http-client.service';

describe('PolicyHttpClientService', () => {
  let service: PolicyHttpClientService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PolicyHttpClientService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
