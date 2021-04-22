package tests;		
import org.junit.runner.RunWith;		
import org.junit.runners.Suite;		

@RunWith(Suite.class)				
@Suite.SuiteClasses({				
  LoginNotOk.class,
  LoginOk.class,
  Logout.class,
  VerifyMenuLayout.class,
  CreateNewRepo.class,
  VerifyRepo.class,
  CreateProject.class,
  CreateIssues.class,
  DeleteRepository.class
})		

public class TestSuite {				
			// This class remains empty, it is used only as a holder for the above annotations		
}