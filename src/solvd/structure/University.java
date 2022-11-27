package solvd.structure;

import java.util.List;
import java.util.Objects;

public class University extends ContactInfo{
    private String name;
    private String address;
    private List<UniversityBuilding> universityBuildings;
    private List<Faculty> faculties;

    public University(){

    }

    public University(String phone, String email, String name, String address,
                      List<UniversityBuilding> universityBuildings, List<Faculty> faculties) {
        super(phone, email);
        this.name = name;
        this.address = address;
        this.universityBuildings = universityBuildings;
        this.faculties = faculties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<UniversityBuilding> getUniversityBuildings() {
        return universityBuildings;
    }

    public void setUniversityBuildings(List<UniversityBuilding> universityBuildings) {
        this.universityBuildings = universityBuildings;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        University that = (University) o;
        return name.equals(that.name) && address.equals(that.address) && universityBuildings.equals(that.universityBuildings) && faculties.equals(that.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, address, universityBuildings, faculties);
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", universityBuildings=" + universityBuildings +
                ", faculties=" + faculties +
                '}';
    }
}
