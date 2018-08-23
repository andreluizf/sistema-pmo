
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sistema.pmo.Application;
import com.sistema.pmo.model.Area;
import com.sistema.pmo.repository.AreaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UserRepositoryTest {
	@Autowired
	private AreaRepository repository;

	@Before
	public void setUp() throws Exception {
		Area area1 = new Area("area 1", true);
		Area area2 = new Area("area 2", false);
		// save user, verify has ID value after save
		assertNull(area1.getId());
		assertNull(area2.getId());// null before save
		this.repository.save(area1);
		this.repository.save(area2);
		assertNotNull(area1.getId());
		assertNotNull(area2.getId());
	}

	@Test
	public void testFetchData() {
		/* Test data retrieval */
		List<Area> userA = repository.findByNome("area 1");
		assertNotNull(userA);
		assertEquals(true, userA.stream().findFirst().get().getStatus());
		/* Get all products, list should only have two */
		List<Area> users = repository.findAll();

		int count = (int) users.stream().count();

		assertEquals(count, 2);
	}
}