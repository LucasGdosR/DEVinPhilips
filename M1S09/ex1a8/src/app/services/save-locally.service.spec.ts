import { TestBed } from '@angular/core/testing';

import { SaveLocallyService } from './save-locally.service';

describe('SaveLocallyService', () => {
  let service: SaveLocallyService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SaveLocallyService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
