	void flatWhenPrefixEndingWithDelimiterAppliesPrefix() {
		ContextPairs contextPairs = new ContextPairs(true, "the_");
		Map<String, String> map = Map.of("spring", "boot");
		Map<String, Object> actual = apply(contextPairs.flat("_", (pairs) -> pairs.addMapEntries((item) -> map)));
	}

	@Test
	void flatWhenPrefixAndNameStartingWithDelimiterAppliesPrefix() {
		ContextPairs contextPairs = new ContextPairs(true, "the");
		Map<String, String> map = Map.of("_spring", "boot");
		Map<String, Object> actual = apply(contextPairs.flat("_", (pairs) -> pairs.addMapEntries((item) -> map)));