package net.pincette.jes.util;

import java.util.concurrent.CompletionStage;
import java.util.function.BiFunction;
import javax.json.JsonObject;

/**
 * The first argument is the current state of the aggregate. The second one is the command.
 *
 * @author Werner Donn\u00e9
 * @since 1.0
 */
@FunctionalInterface
public interface Reducer extends BiFunction<JsonObject, JsonObject, CompletionStage<JsonObject>> {}