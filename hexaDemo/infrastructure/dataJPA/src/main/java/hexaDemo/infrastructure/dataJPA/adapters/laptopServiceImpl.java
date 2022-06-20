package hexaDemo.infrastructure.dataJPA.adapters;
import hexaDemo.api.laptopServicePort;
import hexaDemo.model.laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class laptopServiceImpl implements laptopServicePort {
    @Autowired
    private hexaDemo.infrastructure.dataJPA.adapters.laptopJpaAdapter laptopJpaAdapter;


    @Override
    public List<laptop> getLaptops() {
        System.out.println(laptopJpaAdapter.getLaptops());
        return laptopJpaAdapter.getLaptops();
    }

    @Override
    public laptop getLaptopById(String laptopId) {
        return laptopJpaAdapter.getLaptopById(laptopId);
    }

    @Override
    public laptop addLaptop(laptop laptop) {
        return laptopJpaAdapter.addLaptop(laptop);
    }

    @Override
    public String deleteLaptopById(String laptopId) {
        return laptopJpaAdapter.deleteLaptopById(laptopId);
    }

    @Override
    public laptop updateLaptop(String laptopId, laptop laptop) {
        return laptopJpaAdapter.updateLaptop(laptopId, laptop);
    }
}
