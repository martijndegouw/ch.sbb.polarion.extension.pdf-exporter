package ch.sbb.polarion.extension.pdf.exporter.util.html;

import java.util.Map;
import java.util.Optional;

public interface LinkInternalizer {
    Optional<String> inline(Map<String, String> attributes);
}
