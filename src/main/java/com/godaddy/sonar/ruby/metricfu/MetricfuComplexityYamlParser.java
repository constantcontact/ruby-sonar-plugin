package com.godaddy.sonar.ruby.metricfu;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.sonar.api.BatchExtension;

public interface MetricfuComplexityYamlParser extends BatchExtension
{
    List<RubyFunction> parseFunctions(String fileName, File resultsFile, String complexityType) throws IOException;
}
