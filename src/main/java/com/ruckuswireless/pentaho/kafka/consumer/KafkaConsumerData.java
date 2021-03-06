package com.ruckuswireless.pentaho.kafka.consumer;

import kafka.consumer.ConsumerIterator;
import kafka.javaapi.consumer.ConsumerConnector;

import org.pentaho.di.core.row.RowMetaInterface;
import org.pentaho.di.trans.step.BaseStepData;
import org.pentaho.di.trans.step.StepDataInterface;

/**
 * Holds data processed by this step
 * 
 * @author Michael
 */
public class KafkaConsumerData extends BaseStepData implements StepDataInterface {

	ConsumerConnector consumer;
	ConsumerIterator<byte[], byte[]> streamIterator;
	RowMetaInterface outputRowMeta;
	boolean canceled;
	int processed;
}
