package specification.common;

import specification.Specification;

import java.util.Collections;
import java.util.List;

public class FindByID implements Specification {

    private final Integer id;

    public FindByID(Integer id) {
        this.id = id;
    }

    @Override
    public String toSql() {
        return "where id = ?";
    }

    @Override
    public List<Object> getParameters() {
        return Collections.singletonList(id);
    }
}