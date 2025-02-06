FROM node:14.17
WORKDIR /app
COPY . .
RUN npm install --production
RUN npm run build
CMD ["npm", "start"]
EXPOSE 3000
