package com.spring.batch.reports.model;

import lombok.Builder;

@Builder
public record Country (String name,
                        String lenguage,
                        String currency) {}