/*
 * Copyright © 2014 Federico Recio (N/A)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.federecio.dropwizard.swagger;

import org.checkerframework.checker.nullness.qual.Nullable;

/**
 * Contains all configurable parameters required to render the SwaggerUI View from the default
 * template
 */
public class SwaggerViewConfiguration implements Cloneable {

  private static final String DEFAULT_TITLE = "Swagger UI";
  private static final String DEFAULT_TEMPLATE = "index.ftl";

  @Nullable private String pageTitle;

  @Nullable private String templateUrl;

  @Nullable private String validatorUrl;

  private boolean showApiSelector;
  private boolean showAuth;

  public SwaggerViewConfiguration() {
    this.pageTitle = DEFAULT_TITLE;
    this.templateUrl = DEFAULT_TEMPLATE;
    this.validatorUrl = null;
    this.showApiSelector = true;
    this.showAuth = true;
  }

  @Nullable
  public String getPageTitle() {
    return pageTitle;
  }

  public void setPageTitle(@Nullable String title) {
    this.pageTitle = title;
  }

  @Nullable
  public String getTemplateUrl() {
    return templateUrl;
  }

  public void setTemplateUrl(@Nullable String templateUrl) {
    this.templateUrl = templateUrl;
  }

  @Nullable
  public String getValidatorUrl() {
    return validatorUrl;
  }

  public void setValidatorUrl(@Nullable String validatorUrl) {
    this.validatorUrl = validatorUrl;
  }

  public boolean isShowApiSelector() {
    return showApiSelector;
  }

  public void setShowApiSelector(boolean showApiSelector) {
    this.showApiSelector = showApiSelector;
  }

  public boolean isShowAuth() {
    return showAuth;
  }

  public void setShowAuth(boolean showAuth) {
    this.showAuth = showAuth;
  }

  @Override
  public SwaggerViewConfiguration clone() {
    try {
      SwaggerViewConfiguration clone = (SwaggerViewConfiguration) super.clone();
      return clone;
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }
}
