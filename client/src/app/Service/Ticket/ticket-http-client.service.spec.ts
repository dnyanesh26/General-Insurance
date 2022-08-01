import { TestBed } from '@angular/core/testing';

import { TicketHttpClientService } from './ticket-http-client.service';

describe('TicketHttpClientService', () => {
  let service: TicketHttpClientService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TicketHttpClientService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
