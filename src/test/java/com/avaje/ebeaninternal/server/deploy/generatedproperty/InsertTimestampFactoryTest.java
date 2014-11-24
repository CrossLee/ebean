package com.avaje.ebeaninternal.server.deploy.generatedproperty;

import com.avaje.ebeaninternal.server.deploy.meta.DeployBeanProperty;
import org.junit.Test;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

import static org.junit.Assert.*;

public class InsertTimestampFactoryTest {

  InsertTimestampFactory factory = new InsertTimestampFactory();

  @Test
  public void test_createdTimestamp_LocalDateTime() {

    DeployBeanProperty prop = new DeployBeanProperty(null, LocalDateTime.class, null, null);

    GeneratedProperty insertTimestamp = factory.createInsertTimestamp(prop);
    Object value = insertTimestamp.getInsertValue(null, null);
    assertTrue(value instanceof LocalDateTime);
  }

  @Test
  public void test_createdTimestamp_OffsetDateTime() {

    DeployBeanProperty prop = new DeployBeanProperty(null, OffsetDateTime.class, null, null);

    GeneratedProperty insertTimestamp = factory.createInsertTimestamp(prop);
    Object value = insertTimestamp.getInsertValue(null, null);
    assertTrue(value instanceof OffsetDateTime);
  }

  @Test
  public void test_createdTimestamp_Timestamp() {

    DeployBeanProperty prop = new DeployBeanProperty(null, Timestamp.class, null, null);

    GeneratedProperty insertTimestamp = factory.createInsertTimestamp(prop);
    Object value = insertTimestamp.getInsertValue(null, null);
    assertTrue(value instanceof Timestamp);
  }

  @Test
  public void test_createdTimestamp_utilDate() {

    DeployBeanProperty prop = new DeployBeanProperty(null, java.util.Date.class, null, null);

    GeneratedProperty insertTimestamp = factory.createInsertTimestamp(prop);
    Object value = insertTimestamp.getInsertValue(null, null);
    assertTrue(value instanceof java.util.Date);
  }

}