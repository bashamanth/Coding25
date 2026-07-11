package com.learnkafkastreams.topology;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.Topology;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.Produced;

public class GreetingTopology {

    public static final String GREETING = "greeting";

    public static final String GREETING_UPPERCASE = "greeting_uppercase";

    public static Topology buildTopology() {

        StreamsBuilder streamsBuilder = new StreamsBuilder();

        var greetingStream = streamsBuilder.stream(GREETING, Consumed.with(Serdes.String(), Serdes.String()));

        var greeting_uppercase = greetingStream.mapValues(((readOnlyKey, value) -> value.toUpperCase()));

        greeting_uppercase.to(GREETING_UPPERCASE, Produced.with(Serdes.String(), Serdes.String()));

        return streamsBuilder.build();
    }


}
