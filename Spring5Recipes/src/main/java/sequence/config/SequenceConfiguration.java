package sequence.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@ComponentScan(
		includeFilters = {
				@ComponentScan.Filter(
						type = FilterType.REGEX,
						pattern = {"sequence.*Dao", "sequence.*Service"})
		},
		excludeFilters = {
				@ComponentScan.Filter(
						type = FilterType.REGEX,
						classes = {org.springframework.stereotype.Controller.class})
		})
public class SequenceConfiguration {

}
