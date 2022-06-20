package hexaDemo.infrastructure.dataJPA.adapters;
import hexaDemo.model.laptop;
import hexaDemo.infrastructure.dataJPA.repository.laptopRepo;
import hexaDemo.spi.laptopPersistencePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class laptopJpaAdapter implements laptopPersistencePort {

    @Autowired
    laptopRepo lRepo;

    @Override
    public List<laptop> getLaptops() {
        return lRepo.findAll();
    }

    @Override
    public laptop getLaptopById(String laptopId) {
        return lRepo.findById(laptopId).get();
    }


    @Override
    public laptop addLaptop(laptop laptop) {
        return lRepo.save(laptop);
    }

    @Override
    public String deleteLaptopById(String laptopId) {
        lRepo.deleteById(laptopId);
        return "Deleted Successfully!!";
    }

    @Override
    public laptop updateLaptop(String laptopId, laptop laptop) {
        laptop laptop1 = lRepo.findById(laptopId).get();
        laptop.setLaptopID(laptop1.getLaptopID());
        lRepo.save(laptop);
        return laptop;
    }
}
