import { TestBed } from '@angular/core/testing';

import { SkillNodeService } from './skill-node.service';

describe('SkillNodeService', () => {
  let service: SkillNodeService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SkillNodeService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
