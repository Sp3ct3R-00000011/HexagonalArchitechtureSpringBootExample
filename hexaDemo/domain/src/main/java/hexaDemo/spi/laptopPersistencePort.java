package hexaDemo.spi;

import hexaDemo.model.laptop;

import java.util.List;

public interface laptopPersistencePort {

    List<laptop> getLaptops();

    laptop getLaptopById(String laptopId);

    laptop addLaptop(laptop laptop);

    String deleteLaptopById(String laptopId);

    laptop updateLaptop(String laptopId, laptop laptop);
}
