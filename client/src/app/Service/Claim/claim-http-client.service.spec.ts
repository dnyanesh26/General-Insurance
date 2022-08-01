import { TestBed } from '@angular/core/testing';

import { ClaimHttpClientService } from './claim-http-client.service';

describe('ClaimHttpClientService', () => {
  let service: ClaimHttpClientService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ClaimHttpClientService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
