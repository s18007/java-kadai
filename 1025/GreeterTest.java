import  static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class GreeterTest {
		private final Acount japan = new Acount("hanakoSUZUKI", Country.valueOf("JAPAN"));
		private final Greeter greeterJapan = GreeterFactory.getGreeter(japan);
		private final Acount germany = new Acount("UdoMuller", Country.valueOf("GERMANY"));
		private final Greeter greeterGermany = GreeterFactory.getGreeter(germany);
		private final Acount france = new Acount("GerrardDepardieu", Country.valueOf("FRANCE"));
		private final Greeter greeterFrance = GreeterFactory.getGreeter(france);
		private final Acount usa = new Acount("JackReacher", Country.valueOf("USA"));
		private final Greeter greeterUSA = GreeterFactory.getGreeter(usa);
										


										
		@Test
		public void doTestJAPAN_login() {
				assertThat(greeterJapan.login(japan), is("こんにちは、hanakoSUZUKIさん。"));
    }

		@Test
		public void doTestJAPAN_like() {
				assertThat(greeterJapan.like(japan), is("ありがとう。"));
}

		@Test
		public void doTestJAPAN_logout() {
				assertThat(greeterJapan.logout(japan), is("さようなら。"));
    }

		@Test
		public void doTestGERMANY_login() {
				assertThat(greeterGermany.login(germany), is("Guten Tag, UdoMuller"));
    }

		@Test
		public void doTestGERMANY_like() {
				assertThat(greeterGermany.like(germany), is("Danke Schon"));
}

		@Test
		public void doTestGERMANY_logout() {
				assertThat(greeterGermany.logout(germany), is("Aus Wiedersehen."));
    }

		@Test
		public void doTestFRANCE_login() {
				assertThat(greeterFrance.login(france), is("Bonjour, GerrardDepardieu"));
    }

		@Test
		public void doTestFRANCE_like() {
				assertThat(greeterFrance.like(france), is("Merci beaucoup"));
}

		@Test
		public void doTestFRANCE_logout() {
				assertThat(greeterFrance.logout(france), is("Au revoir."));
    }


		@Test
		public void doTestUSA_login() {
				assertThat(greeterUSA.login(usa), is("Hello, JackReacher"));
    }

		@Test
		public void doTestUSA_like() {
				assertThat(greeterUSA.like(usa), is("Thank you"));
}

		@Test
		public void doTestUSA_logout() {
				assertThat(greeterUSA.logout(usa), is("Goodbye."));
    }

		public static void main(String args[]) {
				org.junit.runner.JUnitCore.main(GreeterTest.class.getName());
		}	


}
