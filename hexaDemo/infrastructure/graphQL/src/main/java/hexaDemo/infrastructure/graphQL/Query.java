package hexaDemo.infrastructure.graphQL;

import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import hexaDemo.infrastructure.dataJPA.repository.laptopRepo;
import hexaDemo.model.laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class Query implements GraphQLMutationResolver, GraphQLQueryResolver {
	@Autowired
	private laptopRepo lRepo;
	public String test(){

		return "This is wrking!!";
	}
	public laptop addLaptop(laptop l) {
		lRepo.save(l);
		return l;
	}

	public String deleteLaptop(String laptopId) {
		lRepo.deleteById(laptopId);
		return "Laptop ID "+laptopId+" deleted!!!";
	}
	public List<laptop> findAllLaptops(){
		return lRepo.findAll();
	}

	public laptop getlaptop(String laptopId) {
		return (lRepo.findById(laptopId).get());
	}

}
