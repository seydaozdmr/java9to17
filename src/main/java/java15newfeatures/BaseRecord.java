package java15newfeatures;

import java.time.LocalDate;

public record BaseRecord (Long id, String createdBy, LocalDate modified) {
}
