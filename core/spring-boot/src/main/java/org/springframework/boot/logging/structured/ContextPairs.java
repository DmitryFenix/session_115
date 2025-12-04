	 * @param delimiter the delimiter used if there is a prefix
	 * @param pairs callback to add all the pairs
	 * @return a {@link BiConsumer} for use with the {@link JsonWriter}
	 */
	public <T> BiConsumer<T, BiConsumer<String, Object>> flat(String delimiter, Consumer<Pairs<T>> pairs) {
		return flat(joinWith(delimiter), pairs);
	}

	/**