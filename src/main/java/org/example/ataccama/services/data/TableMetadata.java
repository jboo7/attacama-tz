package org.example.ataccama.services.data;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@Getter
@Builder
public class TableMetadata {
    private final String schema;
    @NonNull
    private final String name;
}
